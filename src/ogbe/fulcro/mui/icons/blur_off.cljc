(ns ogbe.fulcro.mui.icons.blur-off
  #?(:cljs (:require
            ["@mui/icons-material/BlurOff" :default BlurOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blur-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlurOff)))