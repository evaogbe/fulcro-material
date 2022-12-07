(ns ogbe.fulcro.mui.icons.blur-circular
  #?(:cljs (:require
            ["@mui/icons-material/BlurCircular" :default BlurCircular]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blur-circular
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlurCircular)))