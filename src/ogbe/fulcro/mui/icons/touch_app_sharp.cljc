(ns ogbe.fulcro.mui.icons.touch-app-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TouchAppSharp" :default TouchAppSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-touch-app-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TouchAppSharp)))