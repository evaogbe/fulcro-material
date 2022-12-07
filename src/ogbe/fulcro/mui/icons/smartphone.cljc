(ns ogbe.fulcro.mui.icons.smartphone
  #?(:cljs (:require
            ["@mui/icons-material/Smartphone" :default Smartphone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smartphone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Smartphone)))