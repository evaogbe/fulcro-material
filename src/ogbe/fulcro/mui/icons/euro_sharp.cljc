(ns ogbe.fulcro.mui.icons.euro-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EuroSharp" :default EuroSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-euro-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EuroSharp)))