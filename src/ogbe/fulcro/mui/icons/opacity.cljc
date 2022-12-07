(ns ogbe.fulcro.mui.icons.opacity
  #?(:cljs (:require
            ["@mui/icons-material/Opacity" :default Opacity]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-opacity
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Opacity)))