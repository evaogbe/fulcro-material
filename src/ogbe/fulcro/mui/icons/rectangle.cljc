(ns ogbe.fulcro.mui.icons.rectangle
  #?(:cljs (:require
            ["@mui/icons-material/Rectangle" :default Rectangle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rectangle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rectangle)))