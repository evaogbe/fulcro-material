(ns ogbe.fulcro.mui.icons.two-k
  #?(:cljs (:require
            ["@mui/icons-material/TwoK" :default TwoK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-two-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TwoK)))