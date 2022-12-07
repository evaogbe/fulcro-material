(ns ogbe.fulcro.mui.icons.text-fields
  #?(:cljs (:require
            ["@mui/icons-material/TextFields" :default TextFields]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-fields
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextFields)))