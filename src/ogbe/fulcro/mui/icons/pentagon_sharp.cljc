(ns ogbe.fulcro.mui.icons.pentagon-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PentagonSharp" :default PentagonSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pentagon-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PentagonSharp)))