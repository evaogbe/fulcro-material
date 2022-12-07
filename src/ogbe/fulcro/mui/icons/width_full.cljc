(ns ogbe.fulcro.mui.icons.width-full
  #?(:cljs (:require
            ["@mui/icons-material/WidthFull" :default WidthFull]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-width-full
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WidthFull)))