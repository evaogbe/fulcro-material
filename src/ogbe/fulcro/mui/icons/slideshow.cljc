(ns ogbe.fulcro.mui.icons.slideshow
  #?(:cljs (:require
            ["@mui/icons-material/Slideshow" :default Slideshow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-slideshow
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Slideshow)))