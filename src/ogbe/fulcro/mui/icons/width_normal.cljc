(ns ogbe.fulcro.mui.icons.width-normal
  #?(:cljs (:require
            ["@mui/icons-material/WidthNormal" :default WidthNormal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-width-normal
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WidthNormal)))