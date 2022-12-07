(ns ogbe.fulcro.mui.icons.nightlight-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NightlightSharp" :default NightlightSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nightlight-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NightlightSharp)))