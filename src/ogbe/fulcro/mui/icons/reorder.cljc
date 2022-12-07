(ns ogbe.fulcro.mui.icons.reorder
  #?(:cljs (:require
            ["@mui/icons-material/Reorder" :default Reorder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reorder
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Reorder)))