(ns ogbe.fulcro.mui.icons.blur-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BlurOnSharp" :default BlurOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blur-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlurOnSharp)))