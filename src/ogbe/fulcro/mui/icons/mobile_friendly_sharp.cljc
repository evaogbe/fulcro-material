(ns ogbe.fulcro.mui.icons.mobile-friendly-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MobileFriendlySharp" :default MobileFriendlySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mobile-friendly-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MobileFriendlySharp)))