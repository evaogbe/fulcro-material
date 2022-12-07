(ns ogbe.fulcro.mui.icons.photo-library
  #?(:cljs (:require
            ["@mui/icons-material/PhotoLibrary" :default PhotoLibrary]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-library
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoLibrary)))