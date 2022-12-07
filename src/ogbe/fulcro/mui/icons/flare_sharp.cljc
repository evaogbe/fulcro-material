(ns ogbe.fulcro.mui.icons.flare-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FlareSharp" :default FlareSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flare-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlareSharp)))