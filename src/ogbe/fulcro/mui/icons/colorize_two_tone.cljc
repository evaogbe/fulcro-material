(ns ogbe.fulcro.mui.icons.colorize-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ColorizeTwoTone" :default ColorizeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-colorize-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ColorizeTwoTone)))