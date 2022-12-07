(ns ogbe.fulcro.mui.icons.hearing-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HearingOutlined" :default HearingOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hearing-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HearingOutlined)))