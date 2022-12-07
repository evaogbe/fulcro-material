(ns ogbe.fulcro.mui.icons.width-wide
  #?(:cljs (:require
            ["@mui/icons-material/WidthWide" :default WidthWide]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-width-wide
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WidthWide)))