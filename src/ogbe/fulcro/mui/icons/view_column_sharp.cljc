(ns ogbe.fulcro.mui.icons.view-column-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ViewColumnSharp" :default ViewColumnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-column-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewColumnSharp)))