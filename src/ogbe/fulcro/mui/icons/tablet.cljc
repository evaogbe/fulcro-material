(ns ogbe.fulcro.mui.icons.tablet
  #?(:cljs (:require
            ["@mui/icons-material/Tablet" :default Tablet]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tablet
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tablet)))