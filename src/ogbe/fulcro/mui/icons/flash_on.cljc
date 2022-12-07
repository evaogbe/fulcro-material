(ns ogbe.fulcro.mui.icons.flash-on
  #?(:cljs (:require
            ["@mui/icons-material/FlashOn" :default FlashOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flash-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlashOn)))