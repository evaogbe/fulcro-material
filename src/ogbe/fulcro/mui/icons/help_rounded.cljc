(ns ogbe.fulcro.mui.icons.help-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HelpRounded" :default HelpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-help-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HelpRounded)))