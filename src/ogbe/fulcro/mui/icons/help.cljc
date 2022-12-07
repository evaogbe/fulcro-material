(ns ogbe.fulcro.mui.icons.help
  #?(:cljs (:require
            ["@mui/icons-material/Help" :default Help]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-help
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Help)))