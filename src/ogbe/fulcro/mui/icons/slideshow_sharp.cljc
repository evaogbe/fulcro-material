(ns ogbe.fulcro.mui.icons.slideshow-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SlideshowSharp" :default SlideshowSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-slideshow-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SlideshowSharp)))