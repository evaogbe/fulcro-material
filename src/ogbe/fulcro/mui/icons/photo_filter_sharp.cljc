(ns ogbe.fulcro.mui.icons.photo-filter-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhotoFilterSharp" :default PhotoFilterSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-filter-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoFilterSharp)))