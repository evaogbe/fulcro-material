(ns ogbe.fulcro.mui.icons.slideshow-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SlideshowOutlined" :default SlideshowOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-slideshow-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SlideshowOutlined)))