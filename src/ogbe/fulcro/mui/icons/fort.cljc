(ns ogbe.fulcro.mui.icons.fort
  #?(:cljs (:require
            ["@mui/icons-material/Fort" :default Fort]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fort
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fort)))