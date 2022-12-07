(ns ogbe.fulcro.mui.icons.photo-library-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhotoLibraryRounded" :default PhotoLibraryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-library-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoLibraryRounded)))