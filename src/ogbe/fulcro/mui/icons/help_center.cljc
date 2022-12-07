(ns ogbe.fulcro.mui.icons.help-center
  #?(:cljs (:require
            ["@mui/icons-material/HelpCenter" :default HelpCenter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-help-center
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HelpCenter)))