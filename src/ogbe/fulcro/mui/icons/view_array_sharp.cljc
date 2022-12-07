(ns ogbe.fulcro.mui.icons.view-array-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ViewArraySharp" :default ViewArraySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-array-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewArraySharp)))