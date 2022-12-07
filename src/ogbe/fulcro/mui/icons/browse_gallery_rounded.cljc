(ns ogbe.fulcro.mui.icons.browse-gallery-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BrowseGalleryRounded" :default BrowseGalleryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-browse-gallery-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrowseGalleryRounded)))