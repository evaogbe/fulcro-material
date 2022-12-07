(ns ogbe.fulcro.mui.icons.branding-watermark
  #?(:cljs (:require
            ["@mui/icons-material/BrandingWatermark" :default BrandingWatermark]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-branding-watermark
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrandingWatermark)))