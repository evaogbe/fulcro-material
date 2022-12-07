(ns ogbe.fulcro.mui.icons.two-mp
  #?(:cljs (:require
            ["@mui/icons-material/TwoMp" :default TwoMp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-two-mp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TwoMp)))