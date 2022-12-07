(ns ogbe.fulcro.mui.icons.photo-library-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhotoLibrarySharp" :default PhotoLibrarySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-library-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoLibrarySharp)))