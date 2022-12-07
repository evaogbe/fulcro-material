(ns ogbe.fulcro.mui.icons.screenshot-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScreenshotSharp" :default ScreenshotSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screenshot-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenshotSharp)))