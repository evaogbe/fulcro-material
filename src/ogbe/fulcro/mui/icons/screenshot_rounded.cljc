(ns ogbe.fulcro.mui.icons.screenshot-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScreenshotRounded" :default ScreenshotRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screenshot-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenshotRounded)))