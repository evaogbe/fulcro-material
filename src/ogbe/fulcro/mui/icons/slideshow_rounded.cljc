(ns ogbe.fulcro.mui.icons.slideshow-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SlideshowRounded" :default SlideshowRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-slideshow-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SlideshowRounded)))