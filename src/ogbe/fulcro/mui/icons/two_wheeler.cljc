(ns ogbe.fulcro.mui.icons.two-wheeler
  #?(:cljs (:require
            ["@mui/icons-material/TwoWheeler" :default TwoWheeler]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-two-wheeler
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TwoWheeler)))