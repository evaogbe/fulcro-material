(ns ogbe.fulcro.mui.icons.view-quilt
  #?(:cljs (:require
            ["@mui/icons-material/ViewQuilt" :default ViewQuilt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-quilt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewQuilt)))