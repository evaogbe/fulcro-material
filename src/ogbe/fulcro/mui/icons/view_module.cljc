(ns ogbe.fulcro.mui.icons.view-module
  #?(:cljs (:require
            ["@mui/icons-material/ViewModule" :default ViewModule]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-module
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewModule)))