(ns ogbe.fulcro.mui.icons.view-in-ar
  #?(:cljs (:require
            ["@mui/icons-material/ViewInAr" :default ViewInAr]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-in-ar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewInAr)))