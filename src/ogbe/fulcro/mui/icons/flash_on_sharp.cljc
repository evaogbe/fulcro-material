(ns ogbe.fulcro.mui.icons.flash-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FlashOnSharp" :default FlashOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flash-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlashOnSharp)))