(ns ogbe.fulcro.mui.icons.visibility-off
  #?(:cljs (:require
            ["@mui/icons-material/VisibilityOff" :default VisibilityOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-visibility-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VisibilityOff)))