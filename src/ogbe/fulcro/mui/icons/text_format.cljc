(ns ogbe.fulcro.mui.icons.text-format
  #?(:cljs (:require
            ["@mui/icons-material/TextFormat" :default TextFormat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-format
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextFormat)))