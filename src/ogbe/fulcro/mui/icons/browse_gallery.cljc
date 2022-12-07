(ns ogbe.fulcro.mui.icons.browse-gallery
  #?(:cljs (:require
            ["@mui/icons-material/BrowseGallery" :default BrowseGallery]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-browse-gallery
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrowseGallery)))