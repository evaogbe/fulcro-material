(ns ogbe.fulcro.mui.icons.disabled-by-default-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DisabledByDefaultTwoTone" :default DisabledByDefaultTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-disabled-by-default-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DisabledByDefaultTwoTone)))