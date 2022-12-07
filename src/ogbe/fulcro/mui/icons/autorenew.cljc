(ns ogbe.fulcro.mui.icons.autorenew
  #?(:cljs (:require
            ["@mui/icons-material/Autorenew" :default Autorenew]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-autorenew
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Autorenew)))