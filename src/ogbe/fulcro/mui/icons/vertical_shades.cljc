(ns ogbe.fulcro.mui.icons.vertical-shades
  #?(:cljs (:require
            ["@mui/icons-material/VerticalShades" :default VerticalShades]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vertical-shades
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VerticalShades)))