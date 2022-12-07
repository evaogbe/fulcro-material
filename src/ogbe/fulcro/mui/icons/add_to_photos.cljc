(ns ogbe.fulcro.mui.icons.add-to-photos
  #?(:cljs (:require
            ["@mui/icons-material/AddToPhotos" :default AddToPhotos]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-to-photos
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddToPhotos)))