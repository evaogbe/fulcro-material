(ns ogbe.fulcro.mui.icons.view-list-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ViewListSharp" :default ViewListSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-list-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewListSharp)))