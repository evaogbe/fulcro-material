(ns ogbe.fulcro.mui.icons.portrait-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PortraitSharp" :default PortraitSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-portrait-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PortraitSharp)))